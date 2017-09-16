<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<title>公告信息管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/affiche/css/style.css" rel="stylesheet">
</head>
<body >
<table width="828" height="522" border="0" align="center" cellpadding="0" cellspacing="0" id="__01">
	<tr>
		<td background="images/image_01.gif">&nbsp;			</td>
		<td height="140" background="images/image_02.gif">&nbsp;			</td>
	</tr>
	<tr>
		<td width="202" rowspan="3" valign="top"><table width="202" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>
<table width="202" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="34" background="images/image_03.gif">&nbsp;</td>
          </tr>
          <tr>
            <td height="310" valign="top"><img src="images/image_09.gif" width="202" height="310" border="0" usemap="#Map"></td>
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
           </td>
          </tr>
        </table></td>
		<td height="34" background="images/image_04.gif">&nbsp;			</td>
	</tr>
	<tr>
		<td height="38" background="images/image_06.gif">&nbsp;			</td>
	</tr>
	<tr>
		<td height="270" valign="top">
			<table width="626" height="100%" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td height="257" align="center" valign="top" background="images/image_08.gif"><table width="600" height="257"  border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td height="22" align="center" valign="top" class="word_orange">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="235" align="center" valign="top">&nbsp;</td>
                  </tr>
                </table></td>
              </tr>
            </table>			</td>
	</tr>
	<tr>
		<td bgcolor="#F0F0F0"></td>
		<td height="43" background="images/image_12.gif"></td>
	</tr>
</table>
</body>
</html>