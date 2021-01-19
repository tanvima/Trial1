$(document).ready(function(){
    $(".nav-link").hover(
        function(){
            $(this).addClass("btn btn-primary");
            $(this).css('color','white');
        }, function(){
            $(this).removeClass("btn btn-primary");
            $(this).css('color','black');
        });
})