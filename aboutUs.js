/**
 * Created by dell on 2017/3/13.
 */
$(function(){
    $.get("/resources/json/aboutus.json",{},function(data){
        $(".aboutus-main").html(template('aboutus-main-template',data));
    })
})