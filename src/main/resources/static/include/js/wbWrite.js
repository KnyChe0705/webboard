$(function(){
	$("#wbInsertBtn").on("click", () => {
		if(!chkData("#wbName", "작성자를")) return;
		else if(!chkData("#wbTitle", "글제목을")) return;
		else if(!chkData("#wbContent", "글내용을")) return;
		else {
			$("#w_writeForm").attr({
				"method":"post",
				"enctype":"mltipart/form-data",
				"action":"/webboard/wbInsert"
			});
			$("#w_writeForm").submit();
		}
	});
	$("#wbCancelBtn").on("click", function(){
		$("#w_writeForm").each(function(){
			this.reset();
		});
	});
	
	$("#wbListBtn").on("click", function(){
		location.href="/webboard/wbList";
	});
});