(function soal4() {

    const radio = document.querySelectorAll('.soal4-radio');

    radio.forEach((element) => {
        element.addEventListener('click', function(e) {
            document.body.style.backgroundColor = `${this.value}`;
        })
    })

})()