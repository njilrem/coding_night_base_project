$.get("hello.html", function () {
    alert("success");
}) ;

var url = "login.html";
var data = {name:"vasja", age:"192", her:"40"};

var posting = $.post(url, data);
console.log(posting);
posting.done(function (data) {
   var context = $(data).find('#context');
   console.log(context);
});
posting.fail(function (data) {
    var context = $(data).find('#context');
    alert(context);
});