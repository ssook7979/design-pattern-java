## Iterator를 도입함으로써
- Waitress는 menu가 어떤 구조로 코딩되어 있는지 알 필요가 없음.
- 반복되는 for loop을 제거
- 각 menu의 concrete class를 참조하고 있으므로 변경이 어려움
    - menu interface를 통일해야함

## menu interface 생성
- createIterator(): iterator 생성 메소드

## Iterator pattern
- 컬렉션 구현 방법을 노출하지 않으면서 컬렉션 내의 모든 객체에 접근할 수 있게 함.
- 컬렉션의 인터페이스 및 구현 간단해짐
