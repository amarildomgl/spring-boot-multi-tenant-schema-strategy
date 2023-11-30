create table pokemon (
    pokemon_pk uuid not null primary key,
    name varchar(255)
);

INSERT INTO pokemon (pokemon_pk, name) VALUES
  ('1b6f7c5c-07c4-4fcb-b3e9-6a5b9688ee26', 'Pikachu'),
  ('62a359f0-4bf9-45b7-81f9-05a5d748b7b8', 'Charizard'),
  ('b4ed789a-96c4-42c8-ae9f-2c78ed384e35', 'Blastoise'),
  ('fc22f1ac-9a34-4972-bdba-4184da4097b7', 'Venusaur');
