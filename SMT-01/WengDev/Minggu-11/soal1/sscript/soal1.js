(function soal1() {

    const nilai = [
        {nama: 'David', nilai: 80},
        {nama: 'Vinoth', nilai: 77},
        {nama: 'Divya', nilai: 88},
        {nama: 'Isyata', nilai: 95},
        {nama: 'Thomas', nilai: 68},
    ]

    for(student of nilai){
       alert(`${student.nama} : ${check(student.nilai)}`);
    }

    function check(n){
        if(n >= 90){
            return 'A'
        } else if(n >= 80){
            return 'B'
        } else if(n >= 70){
            return 'C'
        } else if(n >= 60){
            return 'D'
        } else {
            return 'F';
        }
    }

})()


