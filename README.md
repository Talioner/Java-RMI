# Java-RMI
Aplikacja rozproszona z wykorzystaniem RMI.


Wymagania: wiedza o sposobie tworzenia aplikacji rozproszonych z wykorzystaniem RMI.


Używając RMI należy napisać aplikację rozproszoną będącą prostym systemem do wymiany plików. System składa się z 1 węzła centralnego oraz pewnej liczby węzłów klient-serwer (peer).


Dla uproszczenia zakładamy, że wymieniane są pliki tekstowe. Pliki przechoywane są w sposób rozproszony np. na 3 węzłach, z których pierwszy posiada pierwszą 1/3 pliku, drugi środkową 1/3, a trzeci ostatnią 1/3.


Węzeł centralny musi wspierać metody: 

1. registerNode — zarejestrowanie węzła i przypisanie mu identyfikatora.

2. uploadFile — wysłanie pliku do centrali. Centrala musi wtedy określić 3 węzły, które będą przechowywać plik i wysłać im części tego pliku (używając interfejsu węzła). Wysyłanie plików nie powinno działać (zwracając np. false), dopóki w systemie nie ma co najmniej 3 węzłów typu peer.

3. getPeersForFile — pozwala uzyskać identyfikatory 3 węzłów przechowujących dany plik, wraz z informacją, który węzeł przechowuje który fragment (najprościej założyć, że identyfikatory wysysłane są w kolejności przechowywanych fragmentów) lub informację o braku takiego pliku w systemie.

Węzeł typu peer musi wspierać metody: 

1. acceptFileChunk — używana do przekazania węzłowi fragmentu pliku. Musi być określone jaki to jest plik (nazwa) i która z trzech jego części jest przesyłana.

2. getFileChunk — używana do pobraniu od węzła fragmentu pliku o podanej nazwie.

Interfejs węzła centralnego (konsolowy lub GUI) powinien co najmniej wyświetlać zarejestrowane obecnie węzły (ich identyfikatory). Dobrze gdyby również wyświetlał dostępne pliki tj. ich nazwy i identyfikatory węzłów, które posiadają te pliki. Interfejs węzła typu peer powinien wyświetlać identyfikator węzła oraz posiadane pliki tj. ich nazwy oraz, który fragment przechowują. Interfejs węzła powinien posiadać opcje/przyciski do: (1) zarejestrowania węzła, (2) wysłania pliku, (3) pobrania pliku.


Każdy węzeł typu peer powinien posiadać 2 katalogi na dysku: pierwszy dla fragmentów plików, które otrzymał do przechowania, drugi dla pobranych kompletnych plików. W przypadku realizacji konsolowej każdy węzeł powinien być uruchamiany w osobnej konsoli.
