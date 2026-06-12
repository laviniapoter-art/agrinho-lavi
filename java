document.addEventListener('DOMContentLoaded', () => {
    const btnQuiz = document.getElementById('btn-quiz');
    const resultadoQuiz = document.getElementById('resultado-quiz');

    const perguntas = [
        {
            pergunta: "O que significa a sigla ILPF?\n1) Integração Lavoura-Pecuária-Floresta\n2) Indústria de Leite e Produção de Forragem",
            respostaCorreta: "1"
        },
        {
            pergunta: "Verdadeiro ou Falso: Plantar árvores no pasto melhora o bem-estar do gado por causa da sombra?",
            respostaCorreta: "verdadeiro"
        }
    ];

    btnQuiz.addEventListener('click', () => {
        let acertos = 0;

        let resp1 = prompt(perguntas[0].pergunta);
        if (resp1 === perguntas[0].respostaCorreta) {
            acertos++;
        }

        let resp2 = prompt(perguntas[1].pergunta);
        if (resp2 && resp2.toLowerCase().trim() === perguntas[1].respostaCorreta) {
            acertos++;
        }

        resultadoQuiz.classList.remove('escondido');
        if (acertos === 2) {
            resultadoQuiz.innerHTML = `🎉 Excelente! Você acertou todas (${acertos}/2). Você entende tudo de pecuária sustentável!`;
            resultadoQuiz.style.backgroundColor = "#e8f5e9";
            resultadoQuiz.style.color = "#2e7d32";
        } else {
            resultadoQuiz.innerHTML = `Você acertou ${acertos} de 2. Continue navegando para aprender mais sobre as técnicas sustentáveis!`;
            resultadoQuiz.style.backgroundColor = "#ffebee";
            resultadoQuiz.style.color = "#c62828";
        }
    });
});
