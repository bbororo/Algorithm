-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, CONCAT(CAST(HIRE_YMD AS DATE)) FROM DOCTOR
WHERE MCDP_CD IN('GS', 'CS')
ORDER BY HIRE_YMD DESC, DR_NAME;