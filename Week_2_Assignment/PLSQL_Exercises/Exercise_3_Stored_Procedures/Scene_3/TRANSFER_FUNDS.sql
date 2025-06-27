CREATE TABLE BANK_ACCOUNT(
    ID NUMBER,
    BALANCE NUMBER
);

INSERT INTO BANK_ACCOUNT ( ID, BALANCE)
VALUES
 (1, 10000),
 (2, 20000),
 (3, 30000),
 (4, 50000),
 (5, 60000);

COMMIT;

SELECT * FROM BANK_ACCOUNT;

SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds(
    from_acc IN NUMBER,
    to_acc IN NUMBER,
    amount IN NUMBER
) IS 
    v_balance NUMBER;
BEGIN 
    SELECT BALANCE INTO v_balance FROM BANK_ACCOUNT WHERE ID = from_acc;

    IF v_balance < amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
    END IF;

    UPDATE BANK_ACCOUNT
    SET BALANCE = BALANCE - amount
    WHERE ID = from_acc;

    UPDATE BANK_ACCOUNT
    SET BALANCE = BALANCE + amount
    WHERE ID = to_acc;

    DBMS_OUTPUT.PUT_LINE('Transfer completed successfully.');

END;
/

BEGIN 
   TransferFunds(1, 2, 2000);
END;
/

SELECT * FROM BANK_ACCOUNT;

BEGIN 
   TransferFunds(1, 2, 2000);
END;
/