CREATE TABLE customer_status(
    id NUMBER,
    balace NUMBER,
    is_vip VARCHAR2(5)
);

INSERT INTO customer_status (id, balace, is_vip)
VALUES 
  (1, 8000,'FALSE' ),
  (2, 16000,'FALSE'),
  (3, 9000,'FALSE'),
  (4, 8500,'FALSE'),
  (5, 10000,'FALSE');
COMMIT;

SELECT * FROM CUSTOMER_STATUS;

SET SERVEROUTPUT on;

BEGIN
    for c in (
        SELECT id, balace FROM CUSTOMER_STATUS
    ) LOOP
        IF c.balace > 10000 THEN 
            UPDATE customer_status
            SET is_vip = 'TRUE'
            WHERE id = c.id;

            DBMS_OUTPUT.PUT_LINE('Customer ' || c.id || ': Marked as VIP');
        ELSE
            UPDATE customer_status
            SET is_vip = 'FALSE'
            WHERE id = c.id;

          DBMS_OUTPUT.PUT_LINE('Customer ' || c.id || ': Not a VIP');
        END IF;
    END LOOP;
END;
/  
SELECT * FROM CUSTOMER_STATUS;
