CREATE TABLE SAVING_ACCOUNT(
    ID NUMBER,
    BALANCE NUMBER
);

INSERT INTO SAVING_ACCOUNT(ID, BALANCE)
VALUES
    (1, 50000),
    (2, 150000),
    (3, 75000),
    (4, 500000),
    (5, 90000);

SELECT * FROM SAVING_ACCOUNT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN

    DBMS_OUTPUT.PUT_LINE('Monthly interest processed.');

    FOR acc IN (
        SELECT ID, BALANCE FROM SAVING_ACCOUNT
    )LOOP
        UPDATE SAVING_ACCOUNT
        SET BALANCE = acc.BALANCE + (acc.BALANCE * 0.01)
        WHERE ID = acc.ID;

         DBMS_OUTPUT.PUT_LINE('CUSTOMER ID ' || acc.ID || ' UPDATED BALANCE = ' || 
            TO_CHAR(acc.BALANCE + (acc.BALANCE * 0.01)));
  
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed.');
    
END;
/

BEGIN
    ProcessMonthlyInterest;
    
END;
/
SELECT * FROM SAVING_ACCOUNT;