$('#b1').click(() => {
    $('.one').toggle(2000);
});

$('#b2').click(() => {
    $('.two').fadeToggle(2000);
});

$('#b3').click(() => {
    $('.three').slideToggle(2000);
});

$('#b4').click(() => {
    $('.four').slideDown(2000).slideUp(2000);
})