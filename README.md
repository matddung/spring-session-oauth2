### 2024/04/12 - 카카오 로그인 안되는 상태로 커밋
 - 카카오 로그인만 DB에 저장이 안됨 

### 2024/04/13 - 카카오 로그인 해결
 - 카카오 로그인은 scope에 email이 없고, profile_image만 있기 때문에 기존의 OAuth2MemberInfo를 상속받을 수 없다
 - 우선 OAuth2MemberInfo의 email을 삭제하고, 획일화 시킴
 - 추후 필요에 의해 KakaoMemberInfo를 상속받지 않게하고, 수정 가능