public class MiniGames {
}

// Так если бы чуть больше времени уделил документации и было больше времени, хотел реализовать первый вариант игры для побега, это замочная игра, которая
// была бы реализована через рандом, где нужно было бы выбирать правильное направления вращения отмычки, чтобы открыть свою камеру.


// Ниже рисунок для себя, maybe реализую этот функционал.


//           _____                _____                    _____                            _____                _____                    _____
//         /\    \              |\    \                  /\    \                          /\    \              |\    \                  /\    \
//        /::\    \             |:\____\                /::\    \                        /::\    \             |:\____\                /::\    \
//       /::::\    \            |::|   |               /::::\    \                      /::::\    \            |::|   |               /::::\    \
//      /::::::\    \           |::|   |              /::::::\    \                    /::::::\    \           |::|   |              /::::::\    \
//     /:::/\:::\    \          |::|   |             /:::/\:::\    \                  /:::/\:::\    \          |::|   |             /:::/\:::\    \
//    /:::/__\:::\    \         |::|   |            /:::/__\:::\    \                /:::/__\:::\    \         |::|   |            /:::/__\:::\    \
//   /::::\   \:::\    \        |::|   |           /::::\   \:::\    \              /::::\   \:::\    \        |::|   |           /::::\   \:::\    \
//  /::::::\   \:::\    \       |::|___|______    /::::::\   \:::\    \            /::::::\   \:::\    \       |::|___|______    /::::::\   \:::\    \
// /:::/\:::\   \:::\ ___\      /::::::::\    \  /:::/\:::\   \:::\    \          /:::/\:::\   \:::\ ___\      /::::::::\    \  /:::/\:::\   \:::\    \
///:::/__\:::\   \:::|    |    /::::::::::\____\/:::/__\:::\   \:::\____\        /:::/__\:::\   \:::|    |    /::::::::::\____\/:::/__\:::\   \:::\____\
//\:::\   \:::\  /:::|____|   /:::/~~~~/~~      \:::\   \:::\   \::/    /        \:::\   \:::\  /:::|____|   /:::/~~~~/~~      \:::\   \:::\   \::/    /
// \:::\   \:::\/:::/    /   /:::/    /          \:::\   \:::\   \/____/          \:::\   \:::\/:::/    /   /:::/    /          \:::\   \:::\   \/____/
//  \:::\   \::::::/    /   /:::/    /            \:::\   \:::\    \               \:::\   \::::::/    /   /:::/    /            \:::\   \:::\    \
//   \:::\   \::::/    /   /:::/    /              \:::\   \:::\____\               \:::\   \::::/    /   /:::/    /              \:::\   \:::\____\
//    \:::\  /:::/    /    \::/    /                \:::\   \::/    /                \:::\  /:::/    /    \::/    /                \:::\   \::/    /
//     \:::\/:::/    /      \/____/                  \:::\   \/____/                  \:::\/:::/    /      \/____/                  \:::\   \/____/
//      \::::::/    /                                 \:::\    \                       \::::::/    /                                 \:::\    \
//       \::::/    /                                   \:::\____\                       \::::/    /                                   \:::\____\
//        \::/____/                                     \::/    /                        \::/____/                                     \::/    /
//         ~~                                            \/____/                          ~~                                            \/____/
//


//КОНЦЕПТ КАРТ ДЛЯ ОБМЕНА ИХ НА РАНДОМНЫЙ ПРЕДМЕТ!
// В принципе я хочу еще успеть реализовать RPG мини тут через рандом, то есть будет хп у заключенного и у охраника и они могу драться между собой.

// .------.
//|D.--. |
//| :/\: |
//| (__) |
//| '--'D|
//`------'

//.------.
//|V.--. |
//| :(): |
//| ()() |
//| '--'V|
//`------'

//.------.
//|K.--. |
//| :/\: |
//| :\/: |
//| '--'K|
//`------'

//.------.
//|T.--. |
//| :/\: |
//| (__) |
//| '--'T|
//`------'


//                                       .....................................,,,,,,,,,,,,,,,,,,,*********////////((((((((
//        *                             . ...............................*......,,,,,,,,,,,,,,,,,**********////////(((((((
//                                        ......................................,,,,,,,,,,,,,,,,,,**********////////((((((
//                                        ......... ..............................,,,,,,,,,,,,,,,,,,**********////////((((
//                       .             .  ..... ..................................,,,,,,,,,,,,,,,,*,***********//////////(
//                                     .... ........................................,,,,,,,,,,,,,,,,,,************////////
//                                        . ........................................,,,,,,,,,,,,,,,,,,,,************//////
//                                    .  ....................................,........,,,,,,,,,,,,,,,,,,,,**************//
//                                     .................................................,,,,,,,,,,,,,,,,,,,,**************
//              ...     .            .    ..............................................,,,,,,,,,,,,,,,,,,,,,,,,**********
//            ..,%/...                . ..................................................,,,,,,,,,,,,,***,,,,,,,,,*******
//            ..*%%%%*...     .        .  .............................,..,,.,,,,............,,,,,,,,,*/&/*,,,,,,,,,,,,,**
//    .       ..%%%%%%%%,...            .....................,,**(&&&&&&&&&&&&&&&/,,..........,,,,,,,*&&%(*,,,,,,,,,,,,,,,
//            ..%%%%%%####(,... .    .       ........,*#&&&&&&&&&&&&&&&&&&&&&&&&&&*,............,,,,/%%%%#*,,,,,,,,,,,,,,,
//   .        ../%%%%%#######/,....       .  ....*(&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&(,,..........,,,*%%%%%&/,,,,,,,,,,,,,,,,
//            ..,%%%%%##########/,....     ....*(((%&&&&&&&%######%#%%%%%%%%%%%&&&&*,.........,,,#%%%%%&%,,,,,,,,,,,,,,,,,
//             ..,%%%%%#########((((*.....  ..*((((&&&&%############%%%%%%%%%%%%%%%/,........,,/#%%%%%%#,,,,,,,,,,,,,,,,,,
//              ..,%%%%##########((((((*....../((((#&%&%###############@@@@@@@@%%%%%,......,,*####%%%%/,,,,,..,,,,,,,,,,,,
//               ...*%#%#########(((((((((*...*/////#####&@@@@@@@@#####@@@@@@@@&%%%%*,....,*(((#####/,,,,,*,,,,...,,,,,,,,
//                 ...,###((((((((((((((((/,..*/////#####%@@@@@@@@%####@@@@@@@@@%%%%*,...,/((((###*,,,*#%%/,,.........,..,
//                    ...,(#(((((((((((((((*,.,//////#####@@@@@@@@@####&@@@@@@@@%%%%/,..,,/(((#(**#####%%*,,..............
//                *.    .....,*((((((///////*.,//////#####@@@@@@@@@#####@@@@@@@@&%%%(,,.,*((*((((#######*,,...............
//                     .. ......,,,*((((/////,,*//////#####@@@@@@@@%####&@@@@@@@%%%%#,,,*(((((((#####/,,,.................
//            ............,,**////////////////*,///////####@@@@@@@%############%%%%%/,*(//(((((##/,,,,....................
//            ..,####((((((((///////////////////*//////#####################(///////*//////((((****,,,,,,,,...............
//       (.   ....*######(((((((((((*,*//////////*//////(((///////////////////**//*////////(((((((#####%*,,...............
//. . . . . . . ......**(((/**,,.,,,*///////////////////////////////%%#%%%%%%%%%///////*,,*(((((((((/*,,,.................
//. ..... ........................*////////*,*//////////*////////##%#**/%%%%%%%%%%%*,,.......,,,,,,,......................
//............................,*(((((((((/,......,,,,,*###########%###*%%#%%%#*//%%%/,,...................................
//.....* ........ .........,*###((((((*,,............,*/###############(*%%%%#%##%%%%(*,..................................
//.........................,,,,,,,,,,................,///(*######(((###*##**/%%%*/%%%(/,..................................
//..................................................,///(((###*##(((((*/####%#%#%%%#/(/,..................................
//................................................,,/(/(((#####((#####/,,####%##*/*/,,....................................
//................................................*///((((#######(/###/**######%#/........................................
//..............................................,,,/*(((((###########(//(###(*..........................,.................
//.........................,........,.....,...,,*/((((((((###########%%%%%,,,.............................................
//......,.................,................,,////#(((((((#######(((((**,,,.........................................,......
//..........................................*/*/(((((((((/**,,,,,,,,...,....,...............,.............................
//.............,.......,.,......,....*,.,,,*((((((((////,,,,.,......................,.....................................
//........,.,,....,,.,.,.,*.%*,,,,,,/,,//((((///*/,,,,,,,,...,...,.................................,..............,....*..
//....,,,...........,......*,,,,,***/**,(,,,,,,.*....,....................................................................
//....,.,..,.......,.,,....,.....,,,..,,..,...............................................................................
//..,.,,.............,,................,........,...,....,...,............................................................
//.....,.............,......,...........,..,..,.....,......,...................*......................,...................
//..,..,......,........,,.....,...,....,....,..........,,..,,.,,................,..........,,.,,,,.......,,,,,,,,..,,,,,,,
//..........,..,.,...,...,...,...,.......,........................,,,.,.......,...,...,...,..,,...,,,,,,,.,,,,,,,,,,......
//..............,..,,................,,...,,..,..,,,,,,.,...,.,.,.,.,..,..,,,.,.,.,.,.,.,.,.,.,.,.,,,,,,,.,.,,,,,,,,,,,,,,
//.,,,,,,,,,..,,,,.,,,,.,,,,,.............,...,,..,,..,...,,,,,.,,.,,,,...,.,.,...,...,,..,...,...,@,.,...,...,...,...,,,,

//если кому-то интересно и он серьезно чекает данный документ, то такие арты вы можете делать на различных сайтах.
// Такие арты называются ANCILL или еще проще 24bit.
// ЭТО НЕ РЕКЛАМА!!! Но использую сайт для этого - manytools.org