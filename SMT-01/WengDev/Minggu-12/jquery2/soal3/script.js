$('#p1').click(() => {
    $('#text').animate({
        top: "-=50px"
    })
});

$('#p2').click(() => {
    $('#text').animate({
        top: "+=50px"
    })
});

$('#p3').click(() => {
    $('#text').css("color", "yellow");
});

$('#p4').click(() => {
    $('#text').toggle(1);
});