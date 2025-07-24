CREATE TABLE LOAN(
    ID NUMBER,
    DUE_DATE DATE
);
COMMIT;

SELECT * FROM LOAN;

BEGIN 
    FOR LOAN IN (
        SELECT ID, DUE_DATE FROM LOAN
    )LOOP 
        IF LOAN.DUE_DATE BETWEEN SYSDATE AND SYSDATE +30 THEN
            DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || loan.id || ' - Loan due on ' || TO_CHAR(loan.due_date, 'DD-MON-YYYY'));
        END IF;
    END LOOP;
END;
/

        
