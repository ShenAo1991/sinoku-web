/**
 * Created by ao.shen on 2018/1/1.
 */
$(function () {

});

/**
 * 点击登录按钮
 */
function login() {

    var userName = $('#userName').val();
    var password = $('#userPwd').val();
    if(!userName){
        layer.msg('用户名不能为空');
        return;
    }
    if(!password){
        layer.msg('密码不能为空');
        return;
    }
    $.ajax({
        type: "POST",
        url:'/index/manage/login.do',
        data:{
            userName : userName,
            userPassword :password
        },
        async: false,
        error: function(request) {
            layer.msg('系统异常');
        },
        success: function(data) {
            var json = eval('(' + data + ')');
            if(json.code==0){
                window.location.href="/index/index.do";
            }else{
                layer.msg('系统异常');
            }
        }
    });
}