<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@1/css/pico.min.css" />
</head>
<body>
	<main class="container">
		<article class="grid">
			<div>
				 <hgroup>
		            <h1>MILC</h1>
		            <h2>A minimalist layout for Login pages</h2>
		          </hgroup>
				<form method="post" action="<%=request.getContextPath() %>/login_form.do">
					<input
		              type="text"
		              name="mem_id"
		              placeholder="Id"
		              aria-label="Login"
		              autocomplete="nickname"
		              required
		            />
		            <input
		              type="password"
		              name="mem_pwd"
		              placeholder="Password"
		              aria-label="Password"
		              autocomplete="current-password"
		              required
		            />
		            
		            <button type="submit" class="contrast">로그인</button>
				</form>
			</div>
		</article>
	</main>
</body>
</html>