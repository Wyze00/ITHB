$('#p1').click(() => {
    $('.one').toggle(2000);
})

$('#p2').click(() => {
    $('.two').fadeToggle(2000);
})

$('#p3').click(() => {
    $('.three').slideToggle(2000);
})

$('#p4').click(() => {
    $('.four').slideDown(2000).slideUp(2000);
})