(function soal3(){

    const button = document.querySelector('.soal3-button');

    button.addEventListener('click', () => {

        const tr = document.getElementsByTagName('tr');

        for(let i = 0; i<tr.length; i++){
            if(i % 2 != 0){
                tr[i].style.backgroundColor = '#088484';
            }
        }
    })
})();