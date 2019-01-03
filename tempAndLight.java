let Temperature = 0
let Light = 0
input.onButtonPressed(Button.A, function () {
    basic.showString("" + Light)
    serial.writeValue("Light", Light)
})
input.onButtonPressed(Button.B, function () {
    basic.showString("" + Temperature)
    serial.writeValue("Temperature", Temperature)
})
images.createImage(`
    # . . # #
    # . . # .
    # # # # #
    # . . # #
    # . . # #
    `).showImage(0)
basic.forever(function () {
    Light = input.lightLevel()
    Temperature = input.temperature()
})
