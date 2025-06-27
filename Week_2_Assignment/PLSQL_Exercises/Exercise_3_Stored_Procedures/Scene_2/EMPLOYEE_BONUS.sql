CREATE TABLE EMPLOYEE(
    EMP_ID NUMBER,
    PRESENCE NUMBER,
    SALARY NUMBER
);

INSERT INTO EMPLOYEE ( EMP_ID, PRESENCE, SALARY )
VALUES
    (1, 20, 50000),
    (2, 25, 30000),
    (3, 23, 40000),
    (4, 15, 70000),
    (5, 18, 90000);

SELECT * FROM EMPLOYEE;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus IS 
BEGIN 
     DBMS_OUTPUT.PUT_LINE('Bonus updated  ' );
    FOR emp IN (
        SELECT EMP_ID, PRESENCE, SALARY FROM EMPLOYEE 
    ) LOOP
        IF emp.PRESENCE > 20 THEN
            UPDATE EMPLOYEE
            SET SALARY = emp.SALARY + (emp.SALARY * 0.10)
            WHERE EMP_ID = emp.EMP_ID;

            DBMS_OUTPUT.PUT_LINE('EMPLOYEE ' || emp.EMP_ID || 'UPDATED SALARY = '|| emp.SALARY );
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Bonus updated  ' );
END;
/

BEGIN
    UpdateEmployeeBonus; 
END;
/

SELECT * FROM EMPLOYEE;
