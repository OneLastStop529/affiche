<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>公告信息管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/affiche/css/style.css" rel="stylesheet">
</head>
<body>
<script language="javascript">
function check(form){
	if(form.txt_keyword.value==""){
		alert("请输入查询关键字!");form.txt_keyword.focus();return false;
	}
form.submit();
}

function searchByTopic(){
	document.afficheListForm.action="${pageContext.request.contextPath}/searchByTopicDAction";
	document.afficheListForm.submit();
}
</script><form name="afficheListForm">
<table width="828" height="522" border="0" align="center" cellpadding="0" cellspacing="0" id="__01">
	<tr>
		<td background="${pageContext.request.contextPath}/affiche/images/image_01.gif">&nbsp;			</td>
		<td height="140" background="${pageContext.request.contextPath}/affiche/images/image_02.gif">&nbsp;			</td>
	</tr>
	<tr>
		<td width="202" rowspan="3" valign="top" bgcolor="#F0F0F0"><table width="202" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>
			
		<!--menu start-->

<table width="202" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="34" background="${pageContext.request.contextPath}/affiche/images/image_03.gif">&nbsp;</td>
          </tr>
          <tr>
            <td height="310" valign="top"><img src="${pageContext.request.contextPath}/affiche/images/image_09.gif" width="202" height="310" border="0" usemap="#Map"></td>
          </tr>
        </table>
<map name="Map">
  <area shape="rect" coords="30,45,112,63" href="${pageContext.request.contextPath}/loadSaveAfficheAction">
  <area shape="rect" coords="29,71,114,90" href="${pageContext.request.contextPath}/afficheListAction">
  <area shape="rect" coords="29,96,184,115" href="intercept.htm">
  <area shape="rect" coords="29,122,138,140" href="${pageContext.request.contextPath}/affichePagingAction">
  <area shape="rect" coords="28,146,114,165" href="${pageContext.request.contextPath}/loadUpdateListAction">
  <area shape="rect" coords="29,171,117,189" href="${pageContext.request.contextPath}/deleteListAction">
</map>
		
		<!--menu end-->			
			
			</td>
          </tr>
      </table></td>
		<td height="34" background="${pageContext.request.contextPath}/affiche/images/image_04.gif">&nbsp;			</td>
	</tr>
	<tr>
		<td height="38" background="${pageContext.request.contextPath}/affiche/images/image_06.gif">&nbsp;			</td>
	</tr>
	<tr>
		<td height="270" valign="top">
			<table width="626" height="100%" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td height="257" align="center" valign="top" background="${pageContext.request.contextPath}/affiche/images/image_08.gif"><table width="600" height="271"  border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td height="22" align="center" valign="top" class="word_orange"><strong>删除公告信息</strong></td>
                  </tr>
                  <tr>
                    <td height="249" align="center" valign="top">
                      <table width="400" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td height="30" align="center"><form name="form1" method="post" action="">
        查询关键字&nbsp;
        <input name="txt_keyword" type="text" id="txt_keyword" size="40">
&nbsp;
        <input type="button" name="Submit" value="搜索" onClick="searchByTopic()">
                          </form></td>
                        </tr>
                      </table>
                      <table width="550" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#999999">
                      <tr align="center" bgcolor="#f0f0f0">
                        <td width="214">公告标题</td>
                        <td width="271">公告内容</td>
                        <td width="47">删除</td>
                      </tr>
					
       
					    <c:forEach items="${afficheList}" var="data">
                      <tr bgcolor="#FFFFFF" align="center">
                        
						<td>${data.a_topic }</td>
                        <td>${data.a_content }</td>
                       <td align="center"><a href="${pageContext.request.contextPath}/deleteAfficheAction?a_id=${data.a_id}"><img src="${pageContext.request.contextPath}/affiche/images/delete.gif" width="22" height="22" border="0"></a></td>
                      </tr>
		              </c:forEach>
		              
                    </table></td>
                  </tr>
                </table></td>
              </tr>
            </table>			</td>
	</tr>
	<tr>
		<td bgcolor="#F0F0F0"></td>
		<td height="43" background="${pageContext.request.contextPath}/affiche/images/image_12.gif"></td>
	</tr>
</table>
</form>
</body>
</html>