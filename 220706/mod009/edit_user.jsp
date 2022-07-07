<%@ page language="java" import="java.net.URLEncoder" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="wrap">
		<div id="header">
			<jsp:include page="/incl/banner.jsp">
				<jsp:param name="sub-title" value="<%=URLEncoder.encode(\"mod009 : 배너\", \"UTF-8\") %>" />
			</jsp:include>
		</div>
		<div id="content-wrapper">
			<div class="title">회원정보 수정</div>
			<form action="adduserform.do" method="post">
				<ul>
					<li><p>아이디</p>
						<input type="text" name="userId" value="${user.getUserId()}">${user.userId}</li>
					<li><p>비밀번호</p>
						<input type="password" name="passwd"></li>
					<li><p>이름</p>
						<input type="text" name="userName"></li>
					<li><p>주민번호</p>
						<input type="text" name="ssn" placeholder="앞자리 6자만 입력하세요."></li>
					<li><p>이메일</p>
						<input type="text" name="email1" class="email"><span>@</span> <select
						name="email2">
							<option value="naver.com">naver.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="daum.net">daum.net</option>
					</select></li>
					<li><p>주소</p>주소1 : <input type="text" name="addr1" class="addr"></li>
					<li>주소2 : <input type="text" name="addr2" class="addr"></li>
					<li><button type="submit">가입하기</button></li>
				</ul>
			</form>
		</div>
		<div id="footer">
			<%@ include file="/incl/footer.jsp"%>
		</div>
	</div>
</body>
</html>