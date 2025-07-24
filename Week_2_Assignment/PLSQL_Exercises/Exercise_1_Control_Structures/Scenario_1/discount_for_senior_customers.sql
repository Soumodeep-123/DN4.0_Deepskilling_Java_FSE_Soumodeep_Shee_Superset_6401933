CREATE TABLE customer(
    id NUMBER,
    age NUMBER,
    interest NUMBER
);

INSERT INTO customer (id, age, interest)
VALUES 
  (1, 65, 8000),
  (2, 45, 6000),
  (3, 57, 9000),
  (4, 35, 8500),
  (5, 70, 10000);

SELECT * FROM customer;

SET SERVEROUTPUT on;

DECLARE
    v_interest NUMBER;
BEGIN
    FOR c IN(
        SELECT id, age, interest FROM customer
    )LOOP
        IF c.age > 60 THEN
            v_interest := c.interest -( c.interest * 0.01);
            DBMS_OUTPUT.PUT_LINE ('CUSTOMER OF ID ' || c.id || ' AGE IS OVER 60 - NEW INTERST =' ||v_interest); 
        ELSE
            DBMS_OUTPUT.PUT_LINE ('CUSTOMER OF ID ' || c.id || ' AGE IS NOT OVER 60 - INTERST =' ||v_interest); 
        END IF;
    END LOOP;
END;
/

