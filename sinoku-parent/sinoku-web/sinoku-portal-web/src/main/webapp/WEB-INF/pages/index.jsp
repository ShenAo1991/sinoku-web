<!DOCTYPE html>
<script type="text/javascript" src="../../static/js/vue.js"></script>
<script type="text/javascript">
    var app = new Vue({
        el: '#div1',
        data: {
            message: 'Hello Vue!'
        }
    })
</script>
<body>
    <h2>Hello World!</h2>
    <div id="div1">
        {{message}}
    </div>
</body>
</html>
