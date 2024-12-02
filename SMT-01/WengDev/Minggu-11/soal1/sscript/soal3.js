(function soal3(){

    const number1 = document.getElementById('soal3-number1');
    const number2 = document.getElementById('soal3-number2');
    const operand = document.getElementById('soal3-operand');
    const result = document.getElementById('soal3-result');

    const button = document.querySelectorAll('.soal3-button');

    button.forEach((element) => {
        element.addEventListener('click', function(e){
            calc(this.value);
        })
    })

    function calc(operands){

        const n1 = number1.value;
        const n2 = number2.value;
        let res = 0;
        let op = '';

        if(operands == 'Add'){
            res = Number(n1) + Number(n2);
            op = '+';
        } else if(operands == 'Subtract'){
            res = n1 - n2;
            op = '-';
        } else if(operands == 'Multiply'){
            res = n1 * n2;
            op = '*';
        } else {
            res = n1 / n2;
            op = '/';
        }

        operand.value = op;
        result.value = res;
    }

})()