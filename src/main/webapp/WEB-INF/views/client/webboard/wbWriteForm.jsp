<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/common/common.jspf"%>

<link href="/resources/include/css/wbWrite.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="text-center">
			<h2> 게시판 입력화면 </h2>
		</div>
		<form id="w_writeForm">
			<div class="mb-3 row">
				<label for="wbName"> 작성자 </label>
				<input type="text" id="wbName" name="wbName" class="form-control" placeholder="작성자를 입력해주세요" />
			</div>
			<div class="mb-3 row">
				<label for="wbTitle"> 글제목 </label>
				<input type="text" id="wbTitle" name="wbTitle" class="form-control" placeholder="제목을 입력해주세요" />
			</div>
			<div class="mb-3 row">
				<label for="wbContent"> 글내용 </label>
				<input type="text" id="wbContent" name="wbContent" class="form-control" placeholder="내용을 입력해주세요" />
			</div>
		</form>
		<div class="text-end">
			<button type="button" id="wbInsertBtn">등록</button>
			<button type="button" id="wbCancelBtn">취소</button>
			<button type="button" id="wbListBtn">목록</button>
		</div>
	</div>
	<script src="/resources/include/js/wbWrite.js"></script>
</body>
</html>