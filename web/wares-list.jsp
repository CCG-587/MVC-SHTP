<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  
  <head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="static/css/font.css">
    <link rel="stylesheet" href="static/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="static/js/xadmin.js"></script>

    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        $(function(){
            $('#query').click(function (){
                let startdate = $('#start').val();
                alert(startdate);
                $.ajax({
                    contentType:"application/json;charset=utf-8",
                    type:"get",
                    url:"/querywares",
                    dataType:jsonString,
                    success:function (){
                        alert("success!");
                    },
                    error:function(e){
                        alert("error!!!");
                    }
                });
            })
        })
    </script>
  </head>
  
  <body>
    <div class="x-nav">
      <%--<span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a>
          <cite>导航元素</cite></a>
      </span>--%>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form action="/shtp/WaresQueryServlet" class="layui-form layui-col-md12 x-so">
          <input class="layui-input" placeholder="开始上架时间" id="start" name="start">
          <div id="waresstate" class="layui-input-inline">
            <select id="state" name="state">
              <option>商品状态</option>
              <option>正常</option>
              <option>下架</option>
            </select>
          </div>
          <div class="layui-input-inline">
            <select id="type" name="type">
              <option>商品类型</option>
              <option>类型一</option>
              <option>类型二</option>
              <option>类型三</option>
            </select>
          </div>

          <input type="text" id="userid" name="userid"  placeholder="请输入用户编号" autocomplete="off" class="layui-input">
          <input type="text" id="waresid" name="waresid"  placeholder="请输入商品编号" autocomplete="off" class="layui-input">
<%--          <button id="query" class="layui-btn"  lay-submit="/querywares" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>--%>
          <input class="layui-btn" lay-filter="sreach" type="submit" value="查询">
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加用户','order-add.jsp')"><i class="layui-icon"></i>添加</button>
        <span class="x-right" style="line-height:40px">共有数据：88 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>商品编号</th>
            <th>商品名称</th>
            <th>发布人编号</th>
            <th>价格</th>
            <th>库存</th>
            <th>类型</th>
            <th>上架时间</th>
            <th>状态</th>
            <th >操作</th>
            </tr>
        </thead>
        <tbody>
          <c:forEach items="${waresList}" var="wares">
            <tr>
              <td>
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
              </td>
              <td>${wares.waresid}</td>
              <td>${wares.waresname}</td>
              <td>${wares.userid}</td>
              <td>${wares.waresprice}</td>
              <td>${wares.waresstock}</td>
              <td>${wares.waresremarks}</td>
              <td>&nbsp;&nbsp;</td>
              <td>&nbsp;&nbsp;</td>
              <td class="td-manage">
                <a title="查看"  onclick="x_admin_show('编辑','order-view.jsp')" href="javascript:;">
                  <i class="layui-icon">&#xe63c;</i>d
                </a>
                <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                  <i class="layui-icon">&#xe640;</i>
                </a>
                <a title="详细信息" onclick="member_del(this,'要删除的id')" href="javascript:;">
                  <i class="layui-icon">&#xe641;</i>
                </a>
              </td>
            </tr>
            <br>
          </c:forEach>
        </tbody>
      </table>
      <div class="page">
        <div>
          <a class="prev" href="">&lt;&lt;</a>
          <a class="num" href="">1</a>
          <span class="current">2</span>
          <a class="num" href="">3</a>
          <a class="num" href="">489</a>
          <a class="next" href="">&gt;&gt;</a>
        </div>
      </div>

    </div>
    <script>
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>
    <%--<script>
      var _hmt = _hmt || []; (function()
        {var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();
    </script>--%>
  </body>

</html>