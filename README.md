**# HRMS
## *Human Resources Management System - Backend*

![Human-resource-management](https://user-images.githubusercontent.com/23256436/127564995-8a812bf5-8cc4-4405-80b6-8d2dfb25eff8.png)

---
<br>

[//]: <> ## *Gerçek email'e doğrulama mesajı gönderme*



## *BACKEND İSTERLERİ* 

## Madde 1 : İş Arayanlar sisteme kayıt olabilmelidir.*

### Kabul Kriterleri:

:sweat_drops:	Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
<br>
:sweat_drops:	Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
<br>
:sweat_drops:	Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
<br>
:sweat_drops:	Doğrulama geçerli değilse kullanıcı bilgilendirilir.
<br>
:sweat_drops:	Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
<br>
:sweat_drops:	Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

---

## Madde 2 : İş verenler sisteme kayıt olabilmelidir.*

### Kabul Kriterleri:

:sweat_drops: Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
<br>
:sweat_drops: Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
<br>
:sweat_drops: Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
<br>
:sweat_drops:Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

---

##Madde 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.*

### Kabul Kriterleri:
:sweat_drops:Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.

---

##  Madde 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)*

---

## Madde 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)*

---

## Madde 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)*

---

## Madde 7 : İş verenler sisteme iş ilanı ekleyebilmelidir.*

### Kabul Kriterleri:
- İş ilanı formunda;
 
:sweat_drops:Seçilebilir listeden (dropdown) genel iş pozisyonu seçilebilmelidir.(Örneğin Java Developer)(Zorunlu) 
<br>
:sweat_drops:İş tanımı girişi yapılabilmelidir. (Örneğin; firmamız için JAVA, C# vb. dillere hakim....)(Zorunlu)
<br>
:sweat_drops:Şehir bilgisi açılır listeden seçilebilmelidir. (Zorunlu)
<br>
:sweat_drops:Maaş skalası için min-max girişi yapılabilmelidir. (Opsiyonel)
<br>
:sweat_drops:Açık pozisyon adedi girişi yapılabilmelidir. (Zorunlu)
<br>
:sweat_drops:Son başvuru tarihi girişi yapılabilmelidir.

---

## Madde 8 : Sistemdeki tüm aktif iş ilanları listelenebilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Liste, tablo formunda gelmelidir.
<br>
:sweat_drops:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

---

## Madde 9 : Sistemdeki tüm aktif iş ilanları tarihe göre listelenebilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Liste, tablo formunda gelmelidir.
<br>
:sweat_drops:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

---

##  Madde 10 : Sistemde bir firmaya ait tüm aktif iş ilanları listelenebilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Liste, tablo formunda gelmelidir.
<br>
:sweat_drops:Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

---

##  Madde 11 : İş verenler sistemdeki bir ilanı kapatabilmelidir. (Pasif ilan)*

---

## Madde 12: Adaylar sisteme CV girişi yapabilmelidir.*

### Kabul Kriterleri:
:sweat_drops:Adaylar okudukları okulları sisteme ekleyebilmelidir. (Okul adı, bölüm)
<br>
:sweat_drops:Bu okullarda hangi yıllarda okuduklarını sisteme girebilmelidir.
<br>
:sweat_drops:Eğer mezun değilse mezuniyet yılı boş geçilebilmelidir.
<br>
:sweat_drops:Adayların okudukları okullar mezuniyet yılına göre tersten sıralanabilmelidir. Mezun olunmamışsa yine bu okul en üstte ve "devam ediyor" olarak görüntülenmelidir.
<br>
:sweat_drops:Adaylar iş tecübelerini girebilmelidir. (İş yeri adı, pozisyon)
<br>
:sweat_drops:Bu tecrübelerini hangi yıllarda yaptıklarını sisteme girebilmelidir.
<br>
:sweat_drops:Eğer hala çalışıyorsa işten ayrılma yılı boş geçilebilmelidir.
<br>
:sweat_drops:Adayların tecrübeleri yıla göre tersten sıralanabilmelidir. Hala çalışıyorsa yine bu tecrübesi en üstte ve "devam ediyor" olarak görüntülenmelidir.
<br>
:sweat_drops:Adaylar bildikleri yabancı dilleri sisteme girebilmelidir. ( Dil, Seviye -> 1-5)
<br>
:sweat_drops:Adaylar sisteme fotoğraf girebilmelidir. Adaya ait fotoğraf https://cloudinary.com/pricing sisteminde tutulacaktır. (Dış servis entegrasyonu) Ücretsiz hesabı kullanınız.
<br>
:sweat_drops:Adaylar sisteme github adreslerini girebilmelidir.
<br>
:sweat_drops:Adaylar sisteme linkedin adreslerini girebilmelidir.
<br>
:sweat_drops:Adaylar bildikleri programlama dillerini veya teknolojilerini sisteme girebilmelidir. (Programlama/Teknoloji adı) Örneğin; React
<br>
:sweat_drops:Adaylar sisteme ön yazı ekleyebilmelidir. (Örneğin: Çalışmayı çok severim....)

---

### *:desktop_computer: Madde 13 : Bir adaya ait tüm CV bilgisi görüntülenebilmelidir.*

---
<br>

## *Database image*
![Diagrams](https://user-images.githubusercontent.com/23256436/127566985-cce2581e-7be2-4e90-b28e-f9cbcd8b3363.png)


## *Backend - Swagger'da Görüntüsü*    

![swagger](https://user-images.githubusercontent.com/23256436/127566997-62b05863-f358-412c-af4a-e8937bc292ae.png)



## :toolbox: Kullanılan Teknolojiler 

<summary><strong><i> Lombok </i></strong></summary>

--- 

<summary><strong><i> Hibernate </i></strong></summary> 

---

<summary><strong><i> SpringDataJpa </i></strong></summary> 

---

<summary><strong><i> Spring Web </i></strong></summary>

---

<summary><strong><i> PostgreSql </i></strong></summary> 

---

<summary><strong><i> Swagger </i></strong></summary> 

---

<summary><strong><i> Cloudinary </i></strong></summary>

---

## Projemi Geliştirirken Faydalandığım linkler 
---
- Genel olarak :[Baeldung](https://www.baeldung.com)
- Validasyon işlemleri için : [Validation](https://www.baeldung.com/javax-validation)
- Entitites Katmanında Db Bğlantısı ve ayarlar için [Jpa Entities](https://www.baeldung.com/jpa-entities)
- List of Rules kuralları için : [List of Rules](https://www.baeldung.com/java-rule-engines)
- Spring Data Jpa [Spring Data Jpa](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories)
- MicroService [Microservice Mimarisi](https://gokhana.medium.com/microservice-mimarisi-nedir-microservice-mimarisine-giri%C5%9F-948e30cf65b1)
- Derived Query Methods in Spring Data JPA Repositories [Derived Query Methods](https://www.baeldung.com/spring-data-derived-queries)
- @Request Param Annotation [Spring @RequestParam Annotation](https://www.baeldung.com/spring-request-param)
- Spring Cache [Spring Cache](https://www.baeldung.com/spring-cache-tutorial)
- Spring FrameWork Ekosistemi [Spring Ekosistemi](https://medium.com/huawei-developers-tr/2-spring-nedir-spring-boot-ve-spring-framework-neden-kullanılır-2cccb8f3a4fa)
- Hibernate Mapping : [Hibernatte Inheritance Mapping](https://www.baeldung.com/hibernate-inheritance)
- ModelMapper : [ModelMapper](https://www.baeldung.com/java-modelmapper-lists)
