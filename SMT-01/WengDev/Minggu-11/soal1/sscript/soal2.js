(function soal2(){

    const text1 = document.getElementById('soal2-text1');
    const text2 = document.getElementById('soal2-text2');

    text1.addEventListener('keyup', () => {
        console.log(text1.value * 1.8 + 32);
        text2.value = (text1.value * 1.8) + 32;
    })

    text2.addEventListener('keyup', () => {
        text1.value = (text2.value - 32) / 1.8;
    })

})()
