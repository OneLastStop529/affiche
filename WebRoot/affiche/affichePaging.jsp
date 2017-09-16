<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script src="${pageContext.request.contextPath}/affiche/js/paging.js"></script>
<script src="${pageContext.request.contextPath}/affiche/js/jquery-1.6.2.js"></script>
<head>
<title>公告信息管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/affiche/css/style.css" rel="stylesheet">
</head>
<body>
<form id="paging001"name="pagingForm" method="post">
<table width="828" height="522" border="0" align="center" cellpadding="0" cellspacing="0" id="__01">
	<tr>
		<td background="${pageContext.request.contextPath}/affiche/images/image_01.gif">&nbsp;			</td>
		<td height="140" background="${pageContext.request.contextPath}/affiche/images/image_02.gif">&nbsp;			</td>
	</tr>
	<tr>
		<td width="202" rowspan="3" valign="top"><table width="202" border="0" cellspacing="0" cellpadding="0">
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
                    <td height="22" align="center" valign="top" class="word_orange"><strong>公告信息<strong>分页显示</strong></strong></td>
                  </tr>
                  <tr>
                    <td height="249" align="center" valign="top">
					<table width="550" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#999999">
                      <tr align="center" bgcolor="#f0f0f0">
                        <td width="221">公告标题</td>
                        <td width="329">公告内容</td>
                      </tr>
				
                   
                      	     <c:forEach items="${afficheList}" var="data">
                      <tr bgcolor="#FFFFFF" align="center">
						<td>${data.a_topic }</td>
                        <td>${data.a_content }</td>
                      </tr>
		              </c:forEach>
					     		
                     </table>
                      <br>
                      <table width="550" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                        <input type="hidden" id="currPage001" name="currPage"  value="${currPage}"/>
                          <!--  翻页条 -->
							<td width="37%">
							<input type="button" value="上一页" onclick="previousPage()" />
							<input type="button" value="下一页" onclick="nextPage()"/>
							第<input type="text" size="2"/>页<input type="button" value="GO" onclick="go()"/>
							</td>
							<td width="63%" align="right">
							
                        </tr>
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