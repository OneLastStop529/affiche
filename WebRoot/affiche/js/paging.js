
function nextPage(){
//	alert("111");
	
	var currPage_v =$("#currPage001").val();
	
	var v =Number(currPage_v);
	
	v=v+1;
	
	alert(v);
	
	$("#currPage001").val(v);
	
	
	$("#paging001").attr("action","/affiche/affichePagingAction");
	
	$("#paging001").submit();
	}
function previousPage(){
//		alert("222");
	var currPage_v =$("#currPage001").val();
	
	var v =Number(currPage_v);
	
	v=v-1;
	
	alert(v);
	
	$("#currPage001").val(v);
	
	$("#paging001").attr("action","/affiche/affichePagingAction");
	
	$("#paging001").submit();
}
function go(){
	alert("333");
	}