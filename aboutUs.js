
$(function(){
    $.get("/resources/json/aboutus.json",{},function(data){
        $(".aboutus-main").html(template('aboutus-main-template',data));
    })
})