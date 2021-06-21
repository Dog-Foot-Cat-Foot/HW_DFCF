SELECT
    ANIMAL_TYPE
    , nvl(NAME, 'No name')
    , SEX_UPON_INTAKE
FROM
    ANIMAL_INS
order by
    ANIMAL_ID asc;
