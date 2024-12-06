(function soal1(){

    const button = document.querySelector('.soal1-button');

    button.addEventListener('click', () => {

        const tahun = Number(prompt('Masukkan Tahun'));

        if(tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)){
            alert("Tahun Kabisat");
        } else {
            alert("Bukan Tahun Kabisat");
        }
    })
})();