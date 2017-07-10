<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/tageditmanage/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/tageditmanage/camera.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/tageditmanage/bootstrap-responsive.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/tageditmanage/matrix-login.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/tageditmanage/font-awesome.css" rel="stylesheet">
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/jquery-1.7.2.js"></script>
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/jquery.easing.1.3.js"></script>
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/camera.min.js"></script>
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/templatemo_script.js"></script>
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/jquery.cookie.js"></script>
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/jquery.tips.js"></script>
    <script src="<%=request.getContextPath()%>/assets/js/tageditmanage/jquery.cookie.js"></script>
    <script>
        //window.setTimeout(showfh,3000);
        var timer;
        function showfh(){
            fhi = 1;
            //关闭提示晃动屏幕，注释掉这句话即可
            timer = setInterval(xzfh2, 10);
        };
        var current = 0;
        function xzfh(){
            current = (current)%360;
            document.body.style.transform = 'rotate('+current+'deg)';
            current ++;
            if(current>360){current = 0;}
        };
        var fhi = 1;
        var current2 = 1;
        function xzfh2(){
            if(fhi>50){
                document.body.style.transform = 'rotate(0deg)';
                clearInterval(timer);
                return;
            }
            current = (current2)%360;
            document.body.style.transform = 'rotate('+current+'deg)';
            current ++;
            if(current2 == 1){current2 = -1;}else{current2 = 1;}
            fhi++;
        };
    </script>
</head>
<body>
<div style="width:100%;text-align: center;margin: 0 auto;position: absolute;">
    <div id="loginbox">
        <form action="" method="post" name="loginForm"
              id="loginForm">
            <div class="control-group normal_text">
                <h3>
                    <img src="<%=request.getContextPath()%>/assets/images/tageditmanage/head-logo.png" alt="Logo" />
                    <p>旅游互动 — 游记段落标签编辑</p>
                </h3>
            </div>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
							<span class="add-on bg_lg">
							<i><img height="37" src="<%=request.getContextPath()%>/assets/images/tageditmanage/user.png" /></i>
							</span><input type="text" name="loginname" id="loginname" value="" placeholder="请输入用户名" />
                    </div>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
							<span class="add-on bg_ly">
							<i><img height="37" src="<%=request.getContextPath()%>/assets/images/tageditmanage/suo.png" /></i>
							</span><input type="password" name="password" id="password" placeholder="请输入密码" value=""/>
                    </div>
                </div>
            </div>
            <%--<div style="float:right;padding-right:10%;">--%>
                <%--<div style="float: left;margin-top:3px;margin-right:2px;">--%>
                    <%--<!--<font color="white">记住密码</font>-->--%>
                <%--</div>--%>
                <%--<div style="float: left;">--%>
                    <%--<span style="color:#fff">保存密码 </span>--%>
                    <%--<input name="form-field-checkbox" id="saveid" type="checkbox" onclick="savePaw();" style="margin-top:0px;">--%>
                <%--</div>--%>
            <%--</div>--%>
            <div class="form-actions">
                <div style="width:86%;padding-left:8%;">

                    <div style="float: left;">
                        <i><img src="<%=request.getContextPath()%>/assets/images/tageditmanage/yan.png" /></i>
                    </div>
                    <div style="float: left;" class="codediv">
                        <input type="text" name="code" id="code" class="login_code"
                               style="height:23px;padding-top:4px;width: 57px;margin: 0 7px;" />
                    </div>
                    <div style="float: left;">
                        <i><img style="width:70px;height:22px;" id="codeImg" alt="点击更换"
                                title="点击更换" src="" /></i>
                    </div>
                    <span class="pull-right" style="padding-left:3%;"><a href="javascript:quxiao();" class="btn btn-success">取消</a></span>
                    <span class="pull-right"><a onclick="severCheck();" class="flip-link btn btn-info" id="to-recover">登录</a></span>
                </div>
            </div>
        </form>
        <div class="controls">
            <div class="main_input_box">
                <font color="white"><span id="nameerr">Copyright © Autohome 游记</span></font>
            </div>
        </div>
    </div>
</div>
<div id="templatemo_banner_slide" class="container_wapper">
    <div class="camera_wrap camera_emboss" id="camera_slide">
        <div data-src="<%=request.getContextPath()%>/assets/images/tageditmanage/banner_slide_01.jpg"></div>
        <div data-src="<%=request.getContextPath()%>/assets/images/tageditmanage/banner_slide_02.jpg"></div>
        <div data-src="<%=request.getContextPath()%>/assets/images/tageditmanage/banner_slide_03.jpg"></div>
    </div>
    <!-- #camera_wrap_3 -->
</div>

<script type="text/javascript">
    //服务器校验
    function severCheck(){
        if(check()){

            var loginname = $("#loginname").val();
            var password = $("#password").val();
            var code = $("#code").val();
            $.ajax({
                type: "POST",
                url: '<%=request.getContextPath()%>/tageditmanage/login',
                data: {
                    userName:loginname,
                    password:password,
                    secCode:code
                },
                dataType:'json',
                cache: false,
                success: function(data){
                    console.log(data.result.result);
                    if("success" == data.result.result){
                        saveCookie();
                        window.location.href="<%=request.getContextPath()%>/tageditmanage/index?t="+new Date().getTime();
                    }else if("usererror" == data.result.result){
                        $("#loginname").tips({
                            side : 1,
                            msg : "用户名或密码有误",
                            bg : '#FF5080',
                            time : 15
                        });
                        showfh();
                        $("#loginname").focus();
                    }else if("codeerror" == data.result.result){
                        $("#code").tips({
                            side : 1,
                            msg : "验证码输入有误",
                            bg : '#FF5080',
                            time : 15
                        });
                        showfh();
                        $("#code").focus();
                    }else{
                        $("#loginname").tips({
                            side : 1,
                            msg : "缺少参数",
                            bg : '#FF5080',
                            time : 15
                        });
                        showfh();
                        $("#loginname").focus();
                    }
                }
            });
        }
    }

    $(document).ready(function() {
        changeCode();
        $("#codeImg").bind("click", changeCode);
    });

    $(document).keyup(function(event) {
        if (event.keyCode == 13) {
            $("#to-recover").trigger("click");
        }
    });

    function genTimestamp() {
        var time = new Date();
        return time.getTime();
    }

    function changeCode() {
        $("#codeImg").attr("src", "<%=request.getContextPath()%>/sec_code.do?t=" + genTimestamp());
    }

    //客户端校验
    function check() {

        if ($("#loginname").val() == "") {

            $("#loginname").tips({
                side : 2,
                msg : '用户名不得为空',
                bg : '#AE81FF',
                time : 3
            });
            showfh();
            $("#loginname").focus();
            return false;
        } else {
            $("#loginname").val(jQuery.trim($('#loginname').val()));
        }

        if ($("#password").val() == "") {

            $("#password").tips({
                side : 2,
                msg : '密码不得为空',
                bg : '#AE81FF',
                time : 3
            });
            showfh();
            $("#password").focus();
            return false;
        }
        if ($("#code").val() == "") {

            $("#code").tips({
                side : 1,
                msg : '验证码不得为空',
                bg : '#AE81FF',
                time : 3
            });
            showfh();
            $("#code").focus();
            return false;
        }

        $("#loginbox").tips({
            side : 1,
            msg : '正在登录 , 请稍后 ...',
            bg : '#68B500',
            time : 10
        });

        return true;
    }

    function savePaw() {
        if (!$("#saveid").attr("checked")) {
            $.cookie('loginname', '', {
                expires : -1
            });
            $.cookie('password', '', {
                expires : -1
            });
            $("#loginname").val('');
            $("#password").val('');
        }
    }

    function saveCookie() {
        if ($("#saveid").attr("checked")) {
            $.cookie('loginname', $("#loginname").val(), {
                expires : 7
            });
            $.cookie('password', $("#password").val(), {
                expires : 7
            });
        }
    }
    function quxiao() {
        $("#loginname").val('');
        $("#password").val('');
    }

    jQuery(function() {
        var loginname = $.cookie('loginname');
        var password = $.cookie('password');
        if (typeof(loginname) != "undefined"
                && typeof(password) != "undefined") {
            $("#loginname").val(loginname);
            $("#password").val(password);
            $("#saveid").attr("checked", true);
            $("#code").focus();
        }
    });
</script>
<script>
    //TOCMAT重启之后 点击左侧列表跳转登录首页
    if (window != top) {
        top.location.href = location.href;
    }
</script>
</body>

</html>