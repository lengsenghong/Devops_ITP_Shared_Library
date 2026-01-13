## NOTE

-> this is shared library

Scenario
Manage Jenkins → Credentials → Global → Add
| ID | Type | Value |
| ------------------ | ----------- | ----------------------- |
| `TELEGRAM_TOKEN` | Secret Text | your Telegram bot token |
| `TELEGRAM_CHAT_ID` | Secret Text | your chat id |
| `SONARQUBE_TOKEN` | Secret Text | SonarQube token |

-> Load Shared Library in Jenkins

Manage Jenkins → System → Global Pipeline Libraries

| Field           | Value                                                           |
| --------------- | --------------------------------------------------------------- |
| Name            | `itp-shared-lib`                                                |
| Default version | `main`                                                          |
| Retrieval       | Modern SCM                                                      |
| Git repo        | `https://github.com/lengsenghong/Devops_ITP_Shared_Library.git` |

Register Shared Library in Jenkins
Manage Jenkins → System → Global Pipeline Libraries
| Field | Value |
| ---------------- | --------------------------------------------------------------- |
| Name | `itp-shared-lib` |
| Default Version | `main` |
| Retrieval Method | Modern SCM |
| Git URL | `https://github.com/lengsenghong/Devops_ITP_Shared_Library.git` |
