CREATE TABLE IF NOT EXISTS cartao(
                                     id bigserial NOT NULL,
                                     bin varchar NOT NULL,
                                     validade varchar NOT NULL,
                                     cvv varchar NOT NULL,
                                     tipo varchar NOT NULL,
                                     CONSTRAINT ciclo_event_pkey PRIMARY KEY (id)
    )