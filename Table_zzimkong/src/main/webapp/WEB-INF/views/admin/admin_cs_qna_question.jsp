<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- 본문 css --%>
<link href="${pageContext.request.contextPath }/resources/css/admin_popup.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/resources/css/cs_register.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/resources/css/global.css" rel="stylesheet">
<script type="text/javascript">
function qnaAnswerRegisterForm() {
	/* 팝업창 중앙 정렬 */
	var popupW = 950;
	var popupH = 700;
	var left = Math.ceil((window.screen.width - popupW)/2);
	var top = Math.ceil((window.screen.height - popupH)/2);
	window.open('${pageContext.request.contextPath }/admin/cs/qna/answer/register','','width='+popupW+',height='+popupH+',left='+left+',top='+top+',scrollbars=yes,resizable=no,toolbar=no,titlebar=no,menubar=no,location=no')	
}

</script>
</head>
<body class="info_window">
	<section>
		<h3>1 : 1 문의사항</h3>
		<br><br>
		<form action="" method="post" name="memberQnaForm">
			<table>
				<tr>
					<th>번호</th>
					<td>1</td>
					<th>아이디</th>
					<td>
						ZZimkong
					</td>
				</tr>
				<tr>
					<th>유형</th>
					<td>
						사업자회원
					</td>
					<th>
						질문유형
					</th>
					<td>
						예약관리
					</td>
				</tr>
				<tr>
					<th colspan="2">제목</th>
					<td colspan="4">
					--제목제목
					</td>
				</tr>
				<tr>
					<th colspan="2">내용</th>
					<td colspan="4">
					--내용내용
					</td>
				</tr>
				<tr>
					<th colspan="2">파일첨부</th>
					<td colspan="4" class="td_file">
					--사진파일 올라오는 곳<!-- <img rsc=""> -->
					</td>
				</tr>
			</table>
			<br><br>
			<button type="button" class="button_olive" onclick="location.href='${pageContext.request.contextPath }/admin/cs/qna/answer/register'">답글</button>
			<button type="button" id="cs_button_delete">삭제</button>
		</form>
	</section>
</body>
</html>