@APIKI07
  Feature: Dean, kullanicidan gelen mesajlari gorebilmelidir.

    Scenario Outline: Dean kullanicidan gelen mesaji dogrular
      Given Get request ile tum mesajlari al
      Then bodyi dogrula: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

      Examples:
        | name       | email                     | subject |       message              |   date     |
        | Kenan      | keenan.bey96@gmail.com	 | GitHub  |   Bu github yoriy beni     |2023-11-14	 |

