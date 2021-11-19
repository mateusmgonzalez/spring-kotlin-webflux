
CREATE TABLE IF NOT EXISTS public.cartao (
    id serial NOT NULL  PRIMARY KEY,
    bin varchar NOT NULL,
    validade varchar NOT NULL,
    cvv varchar NOT NULL,
    tipo varchar NOT NULL
)

