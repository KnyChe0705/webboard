<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/common/common.jspf"%>


<link href="/resources/include/css/wbList.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="text-center">
			<h2> 게시판 리스트 </h2>
		</div>
		
		<form id="detailForm">
			<input type="hidden" id="wbNo" name="wbNo" />
		</form>
		
		<div id=wbList>
			<table summary="게시판 리스트">
				<thead>
					<tr>
						<th>No</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody id="list">
					<c:choose>
						<c:when test="${not empty wbList}">
							<c:forEach var="webboard" items="${wbList}" varStatus="status">
								<tr class="text-center" data-num="${webboard.wbNo}">
									<td>${webboard.wbNo}</td>
									<td class="goDetail text-center">${webboard.wbTitle}</td>
									<td class="name">${webboard.wbName}</td>
									<td class="text-center">${webboard.wbDate}</td>
									<td class="text-center">${webboard.wbReadcnt}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="5" class="text-center">등록된 게시물이 존재하지 않습니다.</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
		<div class="text-end">
			<button type="button" id="wbWriteFormBtn">등록</button>
		</div>
	</div>
	<script src="/resources/include/js/wbList.js"></script>
</body>
</html>