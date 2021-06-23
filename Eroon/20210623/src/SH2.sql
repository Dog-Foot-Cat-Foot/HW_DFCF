SELECT
    o.ANIMAL_ID
    , o.NAME
FROM
    ANIMAL_OUTS o left outer join ANIMAL_INS i
ON
    o.ANIMAL_ID = i.ANIMAL_ID
WHERE
    i.DATETIME>o.DATETIME
order by
    i.DATETIME;
