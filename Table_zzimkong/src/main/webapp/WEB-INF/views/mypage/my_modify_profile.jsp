<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/resources/css/mypage.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/resources/css/global.css" rel="stylesheet">
</head>
<body>
	<header>
<%-- 		<jsp:include page="../inc/top.jsp"/> --%>
	</header>
	<main>
		<jsp:include page="../inc/my_sidebar.jsp" />
	<div class="wrapper">
		<div>
			<div class="title">
			<span class= "mypg">
				<h1>회원정보 변경</h1>
			</span>
			</div>
			<br>
				<table style="width: 1000px; table-layout: fixed;">
					<tr>
						<th style="width: 300px;">프로필사진</th>
						<td style="width: 700px;">
							<img src="${pageContext.request.contextPath}/resources/img/profile.png" width="100" height="100">
							<p>프로필 사진으로 사용될 이미지를 등록해 주세요.</p>
	                          <input type="file" name="fImage" class="hide"><br>
	                          <button type="reset" id="my_delete">프로필 초기화</button>
						</td>
					</tr>
					<tr>
						<th>이름</th>
						<td>
							<input type="text" class="input_text" value="홍길동" readonly>
						</td>
					</tr>
					<tr>
						<th>생년월일</th>
						<td>
							<input type="text" class="input_text"  value="1996-02-14" readonly>
						</td>
					</tr>
					<tr>
						<th>닉네임</th>
						<td>
							<input type="text" class="input_text"  placeholder="닉네임은 8자 이내로">
							<p>사용하실 닉네임을 입력해주세요. </p>
						</td>
					</tr>
					<tr>
						<th>이메일</th>
						<td>
							<input type="text" class="input_text" placeholder="이메일"><br>
	                    	<p>이메일을 입력해 주세요.</p>
						</td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td>
						 	<div>
	                     	<input type="password" id="txtPassword" class="input_text" placeholder="현재 비밀번호"><br>
	                     	<p>특수문자(예: !@#$ 등) 1자 이상을 포함한 10~15 글자의 비밀번호로 설정해주세요.</p>
	                     	<input type="password" id="txtPassword" class="input_text" placeholder="새 비밀번호"><br>
	                     	<input type="password" id="txtPassword2" class="input_text" placeholder="비밀번호 확인"><br>
	                     </div>
						</td>
					</tr>
				</table>
				
            <a id="btnDeactivate" href="${pageContext.request.contextPath }/my/unregister" class="btn_out">회원탈퇴하기</a> 
            <div class = "click_button">
            		<button type="button" >수정하기</button>
			</div>
	</div>
	</main>
	<footer>
<%-- 		<jsp:include page="../inc/bottom.jsp"/> --%>
	</footer>
</body>
</html>