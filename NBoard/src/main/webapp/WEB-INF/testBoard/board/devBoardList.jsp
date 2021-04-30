<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    

<!-- fontawesome 코드 -->
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.2.0/css/all.css">

<link rel="stylesheet" href="../css/reset.css">
<link rel="stylesheet" href="../css/screen.css">
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/board/groupBoardList.css" />


<style>
 tr:first-child {
        background-color: #6f809a; 
    }

    td {
        border: 1px solid #d6dce7;
    }
</style>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board_List</title>
</head>
<body>
<div class="tbl-wrapAll">
            <div class="btn-grp">
                <form method="post" id="" class="" action="">
                    <span class="float-l">
                        <button type="button" class="btn-active margin-l1" id=""
                            onClick="location.href='#'">전체목록</button>
                        <button type="button" class="btn-off margin-l-2" id="" onClick="location.href='/board/setBoardContents'">게시판등록</button>
                    </span>
                    <span class="float-r">
                        <select name="" id="" class="select-150" p>
                            <option>선택하세요</option>
                            <option>게시물제목</option>
                            <option>게시물내용</option>
                            <option>작성자</option>
                        </select>
                        <input type="text" class="input-150 margin-l-2" name="" required />
                        <button type="submit" class="btn-on margin-r2 margin-l-2" id="">내용검색</button>
                    </span>
                    <div class="clearfix"></div>
                </form>
            </div>
        	
        	<div>
	        	 <table class="font-size4" style="margin-top:10px">
		                <tr class="tr-40 th-color-01 center white underline">
		                    <td class="td-5">번호</td>
		                    <td class="td-10">제목</td>
		                    <td class="td-10">작성자</td>
		                    <td class="td-50">게시물 내용</td>
		                    <td class="td-10">작성일</td>
		                    <td class="td-10">수정일</td>
		                    <td class="td-5">조회수</td>
		                </tr>
		                <tr class="tr-40 tr-color-odd center">
		                    <td>1</td>
		                    <td>게시판 제목</td>
		                    <td>작성자</td>
		                    <td>게시물 내용 입니다</td>
		                    <td>2021</td>
		                    <td>2021</td>
		             	    <td><a href="#" class="bold underline">10</a></td>
		               </tr>
		         </table>
        	</div>
        	
        	
            <div class="page-grp center">
                <span class="page">
                    <a href="#" class="gray"><i class="icon-height1 fas fa-chevron-double-left"></i></a>
                </span>
                <span class="page">
                    <a href="#" class="gray"><i class="icon-height1 fas fa-chevron-left"></i></a>
                </span>
                <span class="page page-active">1</span>
                <span class="page">2</span>
                <span class="page">3</span>
                <span class="page">4</span>
                <span class="page">5</span>
                <span class="page">
                    <a href="#" class="gray"><i class="icon-height1 fas fa-chevron-right"></i></a>
                </span>
                <span class="page">
                    <a href="#" class="gray"><i class="icon-height1 fas fa-chevron-double-right"></i></a>
                </span>
            </div>
        </div>
    </div>
</body>

<input type="text" id="userId" value="${aaa}">
<script type="text/javascript">

</script>
</html>

