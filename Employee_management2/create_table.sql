/* ���[�U�[�e�[�u�� */
CREATE TABLE EmployeeUsersData (
    id INTEGER NOT NULL -- ���[�UID
  , company_code VARCHAR(5) NOT NULL -- ��ƃR�[�h
  , company_depart_code VARCHAR(5) -- �ғ����ƃR�[�h
  , name VARCHAR(50) NOT NULL -- ���O
  , sexes INTEGER NOT NULL -- ���f�
  , birthday date NOT NULL -- ���N����
  , age INTEGER NOT NULL -- �N��
  , zipcode VARCHAR(8) NOT NULL -- �X�֔ԍ�
  , address1 VARCHAR(8) NOT NULL -- �s���{��
  , address2 VARCHAR(32) NOT NULL -- �s�撬��
  , address3 VARCHAR(32) NOT NULL -- ���於
  , block_name VARCHAR(64) NOT NULL -- ���ڈȍ~
  , phonenumber VARCHAR(64) NOT NULL -- �d�b�ԍ�
  , email VARCHAR(255) NOT NULL -- ���[���A�h���X
  , password VARCHAR(255) NOT NULL -- �p�X���[�h
  , employee_type 
VARCHAR(8) NOT NULL -- �ٗp�`��
  , language_code 
VARCHAR(5) -- ����R�[�h
  , entered_at date NOT NULL -- ���ДN����
  , retirement_at date -- �ގДN����
  , company_depart_entered_at date NOT NULL -- �ғ��J�n�N����
  , company_depart_retirement_at date -- �_�񊮗��\��N����
  , created_at datetime -- �o�^����
  , updated_at datetime -- �X�V����
  , deleted_at datetime -- �_���폜�t���O
  , memo text -- ����
  , user_img VARCHAR(255)(255) -- �A�C�R��
  , exist tinyint(1) -- email���j�[�N�����t���O
  , email_flg tinyint(1) -- ���[���z�M�t���O
  , PRIMARY KEY (id)
);
/* ����e�[�u�� */
CREATE TABLE EmployeeLanguageData (
    language_code VARCHAR(5) NOT NULL -- ����R�[�h
  , language VARCHAR(64) NOT NULL -- ����
  , created_at datetime NOT NULL -- �o�^����
  , updated_at datetime NOT NULL -- �X�V����
);
/* ���i�e�[�u�� */
CREATE TABLE EmployeeCompaniesData (
    company_code VARCHAR(5) NOT NULL -- ��ƃR�[�h
  , company_code VARCHAR(64) NOT NULL -- ��Ɩ�
  , created_at datetime -- �o�^����
  , updated_at datetime -- �X�V����
);
/* ����e�[�u�� */
CREATE TABLE EmployeeCompaniesDepartData (
    company_depart_code VARCHAR(5) NOT NULL -- �ғ����ƃR�[�h
  , company_depart_name VARCHAR(64) NOT NULL -- �ғ����Ɩ�
  , created_at datetime -- �o�^����
  , updated_at datetime -- �X�V����
);
