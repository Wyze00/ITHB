 (function soal6(){

    const text = document.querySelector('.soal6-text');
    const button = document.querySelector('.soal6-button');

    button.addEventListener('click', () => {
        alert(text.value);
    })
 })();