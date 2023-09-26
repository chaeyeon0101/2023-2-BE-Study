http
- transfer layer, tcp/ip 기반
- 서버와 클라이언트 간의 요청과 응답 전송
- 비연결성 : 서버가 응답을 마치면 연결을 끊음
- 무상태성 : 서버는 클라이언트에 대한 정보를 저장하지 않기 때문에 클라이언트를 식별하지 못함
- http 연결 : tcp연결을 열어줌 (새연결 or 재사용) -> http메시지 전송 -> 서버가 보낸 응답 읽음 -> 연결 닫기 or 재사용
- http message를 통해 데이터를 주고 받음 (요청, 응답) (http method + 경로 + http 버전 + 헤더)
- http method : 웹서버에 요청하는 목적 및 종류를 알리는 수단 (예) GET, POST, PUT 등)
- http 상태 코드 : 요청에 대한 응답으로 처리 상태를 알려줌, 백의 자리 숫자가 같으면 비슷한 의미

https, http와 비교
- https란? : 하이퍼텍스트 전송 프로토콜 보안, http의 보안 버전
- 암호화 프로토콜(TLS/SSL)을 사용하여 통신을 암호화 (비대칭 공개 키 인프라)
- 트래픽을 암호화했기 때문에 패킷을 스니핑하거나 가로채도 알아볼 수 없음
- http는 웹 사이트 간에 데이터를 전송하는데 사용되는 프로토콜이고 https는 http에 암호화 프로토콜을 사용하여 보안을 강화함

API에 대한 RESTful한 URI를 설계
- 이벤트 목록 조회
  : GET /events
- 이벤트 조회
  : GET /events/{eventId}
- 이벤트 등록
  : POST /events
- 이벤트 수정
  : PUT /events
- 이벤트 삭제
  : DELETE /events
- 이벤트 상태 변경
  : PATCH /events
- 특정 이벤트의 주문 목록 조회
  : GET /events/{eventId}/orders
- 멤버 목록 조회
  : GET /members
- 특정 멤버 권한 변경
  : PATCH /members/{memberId}
- 특정 멤버 정보 조회
  : GET /members/{memberId}
- 특정 멤버 정보 변경
  : PUT /members/{memberId}
- 멤버 등록
  : POST /members
