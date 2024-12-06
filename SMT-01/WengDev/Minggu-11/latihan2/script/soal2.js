
(function soal2(){

    const warna = document.querySelectorAll('.soal2-a');

    warna.forEach((element) => {

        element.addEventListener('mouseover', function(e){
            bgClrSetter(this.href.slice(-7));
        })
    })

    function bgClrSetter(hex){
        document.body.style.backgroundColor = hex;
    }
})();